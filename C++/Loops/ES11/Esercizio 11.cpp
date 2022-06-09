#include <iostream>
using namespace std;

int main() {
    int x;

    cout << "Inserisci un numero per scoprire se si tratta di un numero primo > ";
    cin >> x;

    cout << endl;

    for (int i=2; i<x; i++) {
        if (x%i == 0) {
            cout << "Numero non primo" << endl;
            break;
        } else {
            cout << "Numero primo" << endl;
            break;
        }
    }
    
    return 0;
}
