#include <iostream>
using namespace std;

int main() {
    float avg, tot, x;

    for (int i; i<10; i++) {
        cout << "Inserisci il " << i+1 << "o numero > ";
        cin >> x;
        
        tot += x;
    }

    avg = tot / 10;

    cout << "Somma dei 10 numeri > " << tot << endl;
    cout << "Media dei 10 numeri > " << avg << endl;

    return 0;
}
