package kthelement

def kthElement[A](list: List[A], index: Int): Option[A] =
// TODO: refactor into functional style
  if index > list.size then
    None
  else

    try {

      Some(list.dropRight(list.size-(index+1)).last)

    } catch {

      case e: Exception => None

    }
