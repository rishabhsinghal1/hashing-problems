#include <iostream>
#include <vector>
#include <unordered_set>

using namespace std;

int findMinimalSize(vector<int>& array) {
    unordered_set<int> uniqueElements(array.begin(), array.end());
    return uniqueElements.size();
}

int main() {
    
    vector<int> testcase1 = {1,2,3,2,1}, testcase2 = {1,1,1,1};
    
    cout << findMinimalSize(testcase1) << endl;
    
    cout << findMinimalSize(testcase2) << endl;

    return 0;
}
