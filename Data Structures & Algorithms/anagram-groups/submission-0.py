class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        a = defaultdict(list)
        for s in strs:
            tosort = ''.join(sorted(s))
            a[tosort].append(s)
        return list(a.values())