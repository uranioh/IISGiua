#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

const int arraySize = 20;


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


int findElement(int (&mainArray)[arraySize], int element) {
    int returnValue;

    for (int i=0; i<arraySize; i++) {
        if (mainArray[i] == element) {
            returnValue = 1;
            break;
        }
        else returnValue = 0;
    }

    return returnValue;
}


int main() {
    int mainArray[arraySize];

    cout << "Array generato: \t";
    generateArray(mainArray);
    showArray(mainArray);

    int userInput;
    cout << endl << "Inserisci l'item da cercare: ";
    cin >> userInput;

    cout << endl << findElement(mainArray, userInput);

    cout << endl;
    return 0;
}