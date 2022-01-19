
/* ### Problem statement ###
#### Given a list of size N ####
#### return the nth element ####
*/
package lastelements

def lastElement[A](list: List[A]): Option[A] =
  try {
    Option(list.last)
  } catch {
    case e: Exception => None
    case _ => Option(list.last)
  }








