import sys

pa = {
    "{": "}",
    "(": ")",
    "[": "]"
}


def ans():
    stack = []
    ps = sys.stdin.readline().strip()

    for s in ps:
        if s in ["[", "{", "("]:
            stack.append(s)
        else:
            if not stack:
                return "NO"
            else:
                if pa[stack.pop()] != s:
                    return "NO"

    if stack:
        return "NO"
    else:
        return "YES"


T = int(sys.stdin.readline())

for i in range(T):

    print(ans())