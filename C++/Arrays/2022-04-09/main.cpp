#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

#define arraySize 10
int array[arraySize];

int length = sizeof(array)/sizeof(array[0]);

int totalCycles=0;



int checkSort() {
    int info=0;

    for (int i=length-1; i>0; i--) {
        if (array[i] > array[i-1]) {
            info = 1;
        }
        else {
            info = 0;
            break;
        }

        totalCycles++;
    }

    return info;
}

void showArray() {
    for (int i=0; i<length; i++) {
        cout << array[i] << " ";
    }
    cout << endl;
}

int main() {
    srand(time(0));

    for (int i=0; i<length; i++) {
        array[i] = rand() % 100;
    }
    
    showArray();

    while (checkSort() == 0) {
        for (int i=0; i<length-1; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
            totalCycles++;
        }
    }

    showArray();

    cout << "\nTotal Cycles >> " << totalCycles;

    return 0;
}
