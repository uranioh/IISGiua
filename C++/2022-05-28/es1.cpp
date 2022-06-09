#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

const int row = 10;
const int col = 10;
int array[10][10];

int zeroCount=0;

void generateArrays() {
    for (int i=0; i<row; i++) {
        for (int j=0; j<col; j++) {
            array[i][j] = rand() % 10;

            if (array[i][j] == 0) {
                zeroCount++;
            }
        }
    }    
}


void showArrays() {
    for (int i=0; i<row; i++) {
        for (int j=0; j<col; j++) {
            if (array[i][j] == 0) {
                cout << "\x1B[31m" << array[i][j] << "\033[0m" << " ";
            }
            else {
                cout << array[i][j] << " ";
            }
        }
        cout << endl;
    }
}


void showZeros() {
    cout << endl;
    cout << "Numero di zeri >> " << "\x1B[31m" << zeroCount << "\033[0m";
    cout << endl;
}


int main() {
    srand((unsigned)time(0));

    generateArrays();
    showArrays();
    showZeros();

    return 0;
}
