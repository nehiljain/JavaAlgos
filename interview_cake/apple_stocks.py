
'''

Example : stocks = [10, 4, 50, 60, 1, 30]
'''
def find_max_profit(stocks):

    if len(stocks) < 2:
        raise IndexError("Stocks needs to have length greater than 2 to have profit")

    min_price = stock[0]
    max_profit = stock[0] - stock[1]

    for index, current_price in enumerate(stocks):

        if index == 0:
            continue

        min_price = min(min_price, current_price)

        current_profit = current_price - min_price
        max_profit = max(current_profit, max_profit)


    return max_profit




