#include <iostream>
using namespace std;

int main() {
    int base, exp, pwr=1;
    
    cout << "Inserisci la base della potenza > ";
    cin >> base;
    cout << "Inserisci l'esponente della potenza > ";
    cin >> exp;

    for (int i; i<exp; i++) {
        pwr *= base;
    }

    cout << endl;
    cout << "Risultato > " << pwr << endl;

    return 0;
}
