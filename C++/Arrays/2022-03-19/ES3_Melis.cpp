#include <iostream>
using namespace std;

int main() {
    int arr[9];
    int a;
    int greater_than = 0;

    for (int i; i < 10; i++) {
        cout << "Inserisci il numero in posizione " << i << " > ";
        cin >> arr[i];
    }

    cout << "Inserisci il numero da comparare agli altri numeri dell'array > ";
    cin >> a;

    for (int i; i < 10; i++) {
        if (arr[i] > a) {
            greater_than++;
        }
    }

    cout << "I numeri maggiori di " << a << " dentro l'array sono " << greater_than << endl;

    return 0;
}
