
def get_top_3(ar, fun='max'):
    '''
    retusn the top values in a list based on the fun (min or max)
    >>> get_top_3([2,3,4,5,6,7], 'max')
    [7, 6, 5]
    >>> get_top_3([-1,2,3,4,5,], 'min')
    [-1, 2, 3]
    '''
    result = [None] * 3
    for i in range(0,3):
        remain_ar = list(set(ar) - set(result))
        if fun == 'max':
            result[i] = max(remain_ar)
        elif fun == 'min':
            result[i] = min(remain_ar)
    return result

def find_highest_prod(ar):
    '''
    Returns the highest product of integers in the array

    >>> find_highest_prod([1,10,1,-5,30,-100])
    15000
    >>> find_highest_prod([-1,-2,-3,-4,-5])
    -6
    >>> find_highest_prod([1,10,20,40,3])
    8000
    '''
    if len(ar) < 3:
        raise IndexError("The array does not have 3 integers so input is not correct")

    highest_ints = [ar[0],ar[1],ar[2]]
    lowest_ints = [ar[0],ar[1],ar[2]]
    highest_prod_3 = ar[0] * ar[1] * ar[2]
    lowest_prod_2 = ar[0] * ar[1]
    highest_prod_2 = ar[0] * ar[1]

    for i in ar[2:]:
        highest_prod_3 = max(
            highest_prod_3,
            i * lowest_prod_2,
            i * highest_prod_2
        )

        lowest_prod_2 = min(
            lowest_prod_2,
            i * lowest_ints[0],
            i * highest_ints[0]
        )

        highest_prod_2 = max(
            highest_prod_2,
            i * highest_ints[0],
            i * lowest_ints[0]
        )

        lowest_ints = get_top_3(lowest_ints + [i], fun='min')
        highest_ints = get_top_3(highest_ints + [i], fun='max')
    return highest_prod_3


if __name__ == "__main__":
        import doctest
        doctest.testmod()
