


class Matrix:
	""" Initialise the matrix with null values given matrix size is going to be
	m rows by n columns
	"""
	def __init__(self, m, n):
		self.store = [[None for x in range(n)] for x in range(m)]
		self.nrows = m
		self.ncols = n

	def print_matrix(self):
		for i in range(self.nrows):
			for j in range(self.ncols):
				print(self.store[i][j])


	