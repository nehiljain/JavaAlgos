


class Solution(object):
  @classmethod
  def combination2(cls, candidates, target):
    """
    """
    candidates.sort()
    return cls.dfs(candidates, 0, [], [], target)

  @classmethod
  def dfs(cls, candidates, start_pos, path, result, target):
    if target < 0:
      return
    if target == 0:
      result.append(path)
      return

    for i in xrange(start_pos, len(candidates)):
      if i != start_pos and candidates[i] == candidates[i-1]:
        continue

      cls.dfs(candidates, i+1, path + [candidates[i]], result, target - candidates[i] )

    return result



if __name__ == '__main__':
  print Solution.combination2([10,2,7,1,1,5,6],8)
