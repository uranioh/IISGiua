#include <iostream>
using namespace std;

int main() {
    int a, x, max, min;
    float avg;

    cout << "Quanti valori vuoi inserire? > ";
    cin >> a;

    for (int i=0; i<a; i++) {
        cout << "Inserisci il " << i+1 << "o numero. > ";
        cin >> x;

        if (x > max) {
            max = x;
        }

        if (x < min or min == 0) {
            min = x;
        }

        avg += x;
    }

    avg /= a;

    cout << "Minimo = " << min << endl;
    cout << "Massimo = " << max << endl;
    cout << "Media = " << avg << endl;

    return 0;
}
