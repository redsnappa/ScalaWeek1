package recfun

import scala.collection.mutable.Stack;


object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {

    if(c<=0){
      return 1
    }else if(c==r){
      return 1
    }else{
      pascal(c-1,r-1) + pascal(c,r-1)
    }


  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def innerBalance(innerChar:List[Char], stack: Stack[Char]):Boolean = {
      if(innerChar.isEmpty){
        return stack.isEmpty;
      }else if('('.equals(innerChar.head)){
        return innerBalance(innerChar.tail, stack.push('('));

      }else if(')'.equals(innerChar.head)){
        if(!stack.isEmpty){
          stack.pop();
          return innerBalance(innerChar.tail, stack);
        }else {
          return false;
        }
      }else{
        return innerBalance(innerChar.tail,stack);
      }
    }

    return innerBalance(chars, new Stack())
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    1
  }
}
