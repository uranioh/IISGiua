#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

const int arraySize = 20;
int even=0, odd=0;

void generateArray(int (&mainArray)[arraySize]) {
    srand((unsigned)time(0));

    for (int i=0; i<arraySize; i++) {
        mainArray[i] = rand() % 100;
    }
}


void showArray(int (&mainArray)[arraySize]) {
    for (int i=0; i<arraySize; i++) {
        cout << mainArray[i] << " ";
    }
}


void countTypes(int (&mainArray)[arraySize]) {
    for (int i=0; i<arraySize; i++) {
        if (mainArray[i] % 2 == 0) {
            even++;
        }
        else {
            odd++;
        }
    }
}


void splitArrays(int (&mainArray)[arraySize], int (evenArray)[], int (oddArray)[]) {
    const int evenSize = even;
    const int oddSize = odd;

    for (int i=0; i<arraySize; i++) {
        if (mainArray[i] % 2 == 0) {
            evenArray[even-1] = mainArray[i];
            even--;
        }
        else {
            oddArray[odd-1] = mainArray[i];
            odd--;
        }
    }

    cout << endl << "Array coi numeri pari: \t\t";

    for (int i=0; i<evenSize; i++) {
        cout << evenArray[i] << " ";
    }

    cout << endl << "Array coi numeri dispari: \t";

    for (int i=0; i<oddSize; i++) {
        cout << oddArray[i] << " ";
    }
}


int main() {
    int mainArray[arraySize];

    cout << "Array generato: \t";
    generateArray(mainArray);
    showArray(mainArray);

    countTypes(mainArray);
    cout << endl << even << " " << odd;

    int evenArray[even], oddArray[odd];

    splitArrays(mainArray, evenArray, oddArray);

    cout << endl;
    return 0;
}