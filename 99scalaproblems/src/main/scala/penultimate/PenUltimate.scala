package penultimate

def PenUltimate[A](list: List[A]): Option[A] =

  try {

    if (list.size > 2) then
      PenUltimate(list.tail)
    else
      Option(list.head)

  } catch {
    case e: Exception => None
  }




