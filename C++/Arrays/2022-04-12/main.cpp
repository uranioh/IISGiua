#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std;

const int arraySize = 10;
int mainArray[arraySize];


void generateArray() {
    srand((unsigned)time(0));
    
    for (int i=0; i < arraySize; i++) {
        mainArray[i] = rand() % (2*arraySize+1) - arraySize;
    }
    
} 


void showArray() {
    for (int i=0; i < arraySize; i++) {
        cout << mainArray[i] << " ";
    }
}


void sortArray(bool descending=false) {
    int i, j;

    if (descending) {
        for (i=0; i < arraySize; i++) {		
            for (j=i+1; j < arraySize; j++) {
                if (mainArray[i] < mainArray[j]){
                    int temp = mainArray[i];
                    mainArray[i] = mainArray[j];
                    mainArray[j] = temp;
                }
            }
	    }
    }
    else {
        for (i=0; i < arraySize; i++) {		
            for (j=i+1; j < arraySize; j++) {
                if (mainArray[i] > mainArray[j]){
                    int temp = mainArray[i];
                    mainArray[i] = mainArray[j];
                    mainArray[j] = temp;
                }
            }
        }
    }
}


void showNumber (char type) {
    int highest = arraySize - (arraySize*2);
    int lowest = arraySize+1;
    switch (type) {
        case 'h':
            for (int i=0; i<arraySize; i++) {
                if (mainArray[i] > highest) {
                    highest = mainArray[i];
                }
            }
            cout << highest << endl;
            break;

        case 'l':
            for (int i=0; i<arraySize; i++) {
                if (mainArray[i] < lowest) {
                    lowest = mainArray[i];
                }
            }
            cout << lowest << endl;
            break;

        default:
            cout << "Invalid operation type in function showNumber. [h(ighest), l(owest)]";
    }
}


void mostPresent() {
    //idk
}


int sumOfItems() {
    int sum=0;

    for (int i=0; i < arraySize; i++) {
        sum = sum + mainArray[i];
    }

    return sum;
}


void showEven() {
    for (int i=0; i < arraySize; i++) {
        if (mainArray[i] % 2 == 0) {
            cout << mainArray[i] << " ";
        }
    }
}


void higherThan(int x) {
    for (int i=0; i < arraySize; i++) {
        if (mainArray[i] > x) {
            cout << mainArray[i] << " ";
        }
    }
}


void checkDifferent() {
    // wip too
}


void explicitNegatives() {
    for (int i=0; i < arraySize; i++) {
        if (mainArray[i] >= 0) {
            cout << mainArray[i] << " ";
        }
        else {
            cout << "NEG" << abs(mainArray[i]) << " ";
        }
        
    }
}


void newPositiveArray() {
    srand((unsigned)time(0));
    
    int sortedArray[arraySize];

    for (int i=0; i<arraySize; i++) {
        int random = rand() % 11;
        cout << random;

        int j=0;

        do {
            
        } while (sortedArray[j])
    }


} 


void numberOfNumbers()  {
    int pos=0, neg=0, null=0;
    for (int i=0; i < arraySize; i++) {
        if (mainArray[i] > 0) pos++;
        if (mainArray[i] == 0) null++;
        if (mainArray[i] < 0) neg++;
    }

    cout << endl;
    cout << "Positivi: " << pos << endl;
    cout << "Nulli: " << null << endl;
    cout << "Negativi: " << neg << endl; 
}


void replaceFrom(int min, int max) {
    srand((unsigned)time(0));
    
    for (int i=0; i < arraySize; i++) {
        mainArray[i] = rand() % (max-min+1) + min;
    }
}


int main() {
    int selection=0;

    generateArray();
    showArray();
    
    cout << endl;
    cout << "Scegli l'operazione da effettuare: " << endl;
    cout << "\t1. Visualizza l'array in ordine crescente." << endl;
    cout << "\t2. Visualizza l'array in ordine decrescente." << endl;
    cout << "\t3. Visualizza il numero maggiore." << endl;
    cout << "\t4. Visualizza il numero minore." << endl;
    cout << "\t5. Visualizza il numero piu' presente." << endl;
    cout << "\t6. Visualizza la somma di tutti gli item." << endl;
    cout << "\t7. Visualizza gli elementi pari." << endl;
    cout << "\t8. Visualizza tutti gli elementi maggiori di un numero inserito." << endl;
    cout << "\t9. Verifica se sono presenti almeno 7 elementi diversi tra di loro." << endl;
    cout << "\t10. Stampa a video l'array esplicitando i numeri negativi." << endl;
    cout << "\t11. Crea un secondo array in ordine crescente con soli numeri positivi." << endl;
    cout << "\t12. Comunica il numero degli item positivi, negativi e nulli." << endl;
    cout << "\t13. Sostituisci gli item con numeri specificati MIN e MAX." << endl;

    cout << "> ";
    cin >> selection;

    switch (selection) {
        case 0:
            break;

        case 1: 
            sortArray();
            showArray();
            break;
        
        case 2:
            sortArray(true);
            showArray();
            break;
        
        case 3:
            showNumber('h');
            break;

        case 4:
            showNumber('l');
            break;
        
        case 5:
            mostPresent();
            // not working yet (this ain't ever gonna work for sure)
            break;

        case 6:
            cout << sumOfItems();
            break;

        case 7:
            showEven();
            break;

        case 8:
            int x;
            cout << "Inserisci il numero da verificare > ";
            cin >> x;
            higherThan(x);
            break;

        case 9:
            checkDifferent();
            break;

        case 10:
            explicitNegatives();
            break;

        case 11:
            newPositiveArray();
            break;
    
        case 12:
            numberOfNumbers();
            break;

        case 13:
            int min, max;
            cout << "Inserisci il minimo > ";
            cin >> min;
            cout << "Inserisci il massimo > ";
            cin >> max;
            replaceFrom(min, max);
            showArray();
    }

    cout << endl;
    return 0;
}
