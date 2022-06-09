#include <iostream>
using namespace std;

int main() {
    int arr[9];
    int a;

    for (int i; i < 10; i++) {
        cout << "Inserisci il numero in posizione " << i << " > ";
        cin >> arr[i];
    }

    cout << "Inserisci il numero da trovare all'interno dell'array > ";
    cin >> a;

    for (int i; i < 10; i++) {
        if (a == arr[i]) {
            cout << "Il numero e' presente nell'array." << endl;
            break;
        }
        else if (i == 9) {
            cout << "Il numero NON e' presente nell'array." << endl;
        }
    }

    return 0;
}
