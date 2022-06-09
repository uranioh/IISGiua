#include <iostream>
using namespace std;
const int arraySize=3;
char mainArray[arraySize][arraySize]; 

void initArray() {
    for (int i=0; i < arraySize; i++) {
        for (int j=0; j < arraySize; j++) {
            mainArray[i][j] = ' ';
        }
    }
}


void showArray() {
    for (int i=0; i < arraySize; i++) {
        for (int j=0; j < arraySize; j++) {
            cout << "[" << mainArray[i][j] << "]";
        }
        cout << endl;
    }
}


void game() {
} 


int main() {
    initArray();
    showArray();
}
