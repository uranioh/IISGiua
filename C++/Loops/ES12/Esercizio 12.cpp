#include <iostream>
using namespace std;

int main() {
    int a;
    bool sq;

    cout << "Inserisci un numero > ";
    cin >> a;

    for (int i; i*i<=a; i++) {
        if (i*i == a) {
            sq = true;
            break;
        }
    }

    if (sq) {
        cout << "Quadrato perfetto." << endl;
    } 
    else {
        cout << "Non e' un quadrato perfetto." << endl;
    }

    return 0;
}
