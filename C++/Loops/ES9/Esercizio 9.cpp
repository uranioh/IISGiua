#include <iostream>
using namespace std;

int main() {
    int x, even, tot;

    for (int i; i<10; i++) {
        cout << "Inserisci il " << i+1 << "o numero > ";
        
        cin >> x;

        if (x%2 == 0) {
            tot += x;
            even += 1;
        }
    }

    cout << endl;
    cout << "Somma dei numeri pari > " << tot << endl;
    cout << "Numeri pari inseriti > " << even << endl;

    return 0;
}
