class Solution(object):
    def sortPeople(self, names, heights):
        data = list(zip(heights, names))
        size = len(names)

        # Selection Sort
        for i in range(size):
            maxIndex = i

            for j in range(i+1, size):
                if data[j][0] > data[maxIndex][0]:
                    maxIndex = j

            data[maxIndex], data[i] = data[i], data[maxIndex]

        return [d[1] for d in data]
