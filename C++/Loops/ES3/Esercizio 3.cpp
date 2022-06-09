#include <iostream>
using namespace std;

int main() {
	int a, b, c, x;
	cout << "Inserisci il primo numero: ";
	cin >> a;

	cout << "Inserisci il secondo numero: ";
        cin >> b;

	cout << "Inserisci il terzo numero: ";
        cin >> c;
	

	if (a > b) {
		x = a;
		a = b;
		b = x;
	}

	if (a > c) {
		x = a;
		a = c;
		c = x;
	}

	if (b > c) {
		x = b;
		b = c;
		c = x;
	}

	cout << a << "\t" << b << "\t" << c;

	return 0;
}
