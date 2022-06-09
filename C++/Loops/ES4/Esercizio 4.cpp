#include <iostream>
using namespace std;

int main() {
    int a;

    cout << "Cosa vuoi mangiare?" << endl;
    cout << "1 > Pasta" << endl;
    cout << "2 > Pizza" << endl;
    cout << "3 > Bistecca" << endl;
    cout << "4 > Gelato" << endl;
    cin >> a;

    switch (a) {
        case 1: cout << "Hai scelto di mangiare la pasta."; break;
        case 2: cout << "Hai scelto di mangiare la pizza."; break;
        case 3: cout << "Hai scelto di mangiare la bistecca."; break;
        case 4: cout << "Hai scelto di mangiare il gelato."; break;
        default: cout << "Il numero inserito non risulta essere valido.";
    }

    return 0;
}
