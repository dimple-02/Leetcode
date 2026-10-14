class Solution {
public:
    bool checkRecord(string s) {
        int count=0;
    for(int i=0;i<s.length();i++){
        if(s[i]=='A'){
            count++;
        }
    }
    if(count>1){
        return false;
    }
    for(int i=2;i<s.length();i++){
        if(s[i]=='L' && s[i-1]=='L' && s[i-2]=='L'){
            return false;
        }
    }
    return true;
    }
};