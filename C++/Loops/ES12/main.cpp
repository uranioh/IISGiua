#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int a;
    
    cout << "Inserisci un numero per scoprire se si tratta di un quadrato perfetto > ";
    cin >> a;

    float sqfloat = sqrt(a);
    int sqint = static_cast<int>(sqfloat);

    if (sqfloat == sqint) {
        cout << a << " e' un quadrato perfetto." << endl;
    } else {
        cout << a << " non e' un quadrato perfetto." << endl;
    }

    return 0;
}
