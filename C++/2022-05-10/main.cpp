#include <iostream>
#include <cstdlib>
#include <ctime>
#include <string>
using namespace std;

const int arraySize=8;
char mainArr[arraySize];

void generateArray() {
    srand(time(0));

    for (int i=0; i<arraySize; i++) {
        int item = rand() % 16;

        if (item < 10) {
            mainArr[i] = item + 48;
        }
        else {
            mainArr[i] = item + 55;
        }
    }
}

string showBinary(char hex) {
    string result = "0";

    switch (hex) {
        case '0':
            result = "0000";
            break;

        case '1':
            result = "0001";
            break;

        case '2':
            result = "0010";
            break;

        case '3':
            result = "0011";
            break;
        
        case '4':
            result = "0100";
            break;

        case '5':
            result = "0101";
            break;

        case '6':
            result = "0110";
            break;

        case '7':
            result = "0111";
            break;

        case '8':
            result = "1000";
            break;

        case '9':
            result = "1001";
            break;

        case 'A':
            result = "1010";
            break;

        case 'B':
            result = "1011";
            break;

        case 'C':
            result = "1100";
            break;

        case 'D':
            result = "1101";
            break;

        case 'E':
            result = "1110";
            break;

        case 'F':
            result = "1111";
            break;

    }

    return result;
}

void showArray() {
    for (int i=0; i<arraySize; i++) {
        cout << mainArr[i] << "\t" << showBinary(mainArr[i]) << endl;
    }
}



int main() {
    generateArray();
    showArray();

    cout << endl;
    return 0;
}
