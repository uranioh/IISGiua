#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;


void generateArray(int (&mainArray)[8]) {
    srand((unsigned)time(0));

    for (int i=0; i<8; i++) {
        mainArray[i] = rand() % 100;
    }
}


void showArray(int (&mainArray)[8]) {
    for (int i=0; i<8; i++) {
        cout << mainArray[i] << " ";
    }
    cout << endl;
}


void invertArray(int (&mainArray)[8]) {
    for (int i=0; i<4; i++) {
        int temp = mainArray[i];
        mainArray[i] = mainArray[7-i];
        mainArray[7-i] = temp;
    }
}


int main() {
    int mainArray[8];


    cout << "Array generato: \t";
    generateArray(mainArray);
    showArray(mainArray);

    cout << "Array invertito: \t";
    invertArray(mainArray);
    showArray(mainArray);


    cout << endl;
    return 0;
}