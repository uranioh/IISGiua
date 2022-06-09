#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;


void resetGame(int (&field)[10][10]) {
    for (int i=0; i<10; i++) {
        for (int j=0; j<10; j++) {
            field[i][j] = 0;
        }
    } 
}


void placeMines(int (&field)[10][10]) {
    for (int i=0; i<10; i++) {
        int x=rand() % 10, y=rand() % 10;
        field[x][y] = 1;
    }
}


void showField(int (&field)[10][10]) {
    for (int i=0; i<10; i++) {
        for (int j=0; j<10; j++) {
            cout << field[i][j] << " ";
        }
        cout << endl;
    }
}


int main() {
    int field[10][10]; 
    srand((unsigned)time(0));

    resetGame(field);
    placeMines(field);
    showField(field);

    return 0;
}
