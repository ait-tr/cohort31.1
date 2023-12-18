import { useDispatch, useSelector } from "react-redux"

import { Likeimg, DislikeImg } from "assets"
import Button from "components/Button"
import { actions } from "store/redux/feedback/feedbackSlice"
import { feedbackState } from "store/redux/feedback/selectors"

import { FeedbackWrapper, Count, Image, ImageContainer } from "./styles"

function Feedback() {
  const dispach = useDispatch()
  const feedback = useSelector(feedbackState)

  const plusLike = () => {
    dispach(actions.addLike())
  }

  const plusDisLike = () => {
    dispach(actions.addDisLike())
  }

  const resetCounter = () => {
    dispach(actions.resetResults())
  }

  return (
    <FeedbackWrapper>
      <ImageContainer>
        <Image src={Likeimg} alt="like" onClick={plusLike} />
      </ImageContainer>
      <Count>{feedback.countDisLike}</Count>
      <ImageContainer>
        <Image src={DislikeImg} alt="dislike" onClick={plusDisLike} />
      </ImageContainer>
      <Count>{feedback.countLike}</Count>
      <Button name="Reset Results" onClick={resetCounter} />
    </FeedbackWrapper>
  )
}

export default Feedback
