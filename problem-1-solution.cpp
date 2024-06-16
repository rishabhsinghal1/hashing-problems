#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

vector<int> countDivisibles(vector<int> &scrollA, vector<int> &scrollB) {
    unordered_map<int, int> sacredFrequency;

    // Alice precomputes the frequency of each sacred number in Scroll A
    for (int sacredNumber : scrollA) {
        sacredFrequency[sacredNumber]++;
    }

    vector<int> result(scrollB.size(), 0);

    // Bob counts numbers in Scroll A that are divisible by each powerful divisor in Scroll B
    for (int i = 0; i < scrollB.size(); ++i) {
        int powerfulDivisor = scrollB[i];
        int divisibleCount = 0;

        // Check multiples of the powerfulDivisor in sacredFrequency
        for (const auto &entry : sacredFrequency) {
            if (entry.first % powerfulDivisor == 0) {
                divisibleCount += entry.second;
            }
        }

        result[i] = divisibleCount;
    }

    return result;
}

int main() {
    vector<int> scrollA = {12, 24, 36, 48, 60};
    vector<int> scrollB = {2, 3, 4};

    vector<int> result = countDivisibles(scrollA, scrollB);
    cout << "Result: ";
    for (int count : result) {
        cout << count << " ";
    }
    cout << endl; // Output: Result: 5 5 3

    vector<int> scrollA2 = {5, 10, 15, 20, 25};
    vector<int> scrollB2 = {2, 3, 5};

    result = countDivisibles(scrollA2, scrollB2);
    cout << "Result: ";
    for (int count : result) {
        cout << count << " ";
    }
    cout << endl; // Output: Result: 2 0 5

    return 0;
}
