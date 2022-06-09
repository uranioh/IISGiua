#include <iostream>
using namespace std;

int arr[9];
int max_num;

int main() {
    for (int i; i<10; i++) {
        cout << "Inserisci il numero in posizione " << i << " > ";
        cin >> arr[i];
    }

    for (int i; i<10; i++) {
        if (max_num < arr[i]) {
            max_num = arr[i];
        }
    }

    cout << endl;
    cout << "Il numero maggiore e' " << max_num << endl;

    return 0;
}
