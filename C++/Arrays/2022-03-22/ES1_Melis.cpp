#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std;

int main() {
    int even[30];
    int odd[30];

    srand(time(0));
     
    for (int i=0; i<30; i++) {
        int random = (rand() % 100) + 1;

        if (random % 2 == 0) {
            even[i] = random;
        }
        else {
            odd[i] = random;
        }
    }

    cout << "Numeri pari generati: " << endl;

    for (int i=0; i<30; i++) {
        if (even[i] != 0) {
            cout << even[i] << "\t";
        }
    }

    cout << endl;

    cout << "Numeri dispari generati: " << endl;

    for (int i=0; i<30; i++) {
        if (odd[i] != 0) {
            cout << odd[i] << "\t";
        }
    }

    cout << endl;

    return 0; 
}
