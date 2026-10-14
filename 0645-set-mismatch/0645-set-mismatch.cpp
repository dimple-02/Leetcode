#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int n = nums.size();
        vector<bool> seen(n + 1, false);
        int dup = -1, missing = -1;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (seen[num]) {
                dup = num;
            } else {
                seen[num] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        return {dup, missing};
    }
};


