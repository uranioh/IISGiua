#include <iostream>
using namespace std;

int main() {
    int HH, MM, SS;

    cout << "Inserisci il numero delle ore > ";
    cin >> HH;

    cout << "Inserisci il numero dei minuti > ";
    cin >> MM;

    cout << "Inserisci il numero dei secondi > ";
    cin >> SS;

    cout << "Numero di secondi passati dalla mezzanotte > " << HH*3600 + MM*60 + SS << endl;

    return 0;
}
