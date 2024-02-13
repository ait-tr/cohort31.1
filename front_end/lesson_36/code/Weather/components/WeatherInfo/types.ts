import { ReactNode } from "react"

export interface WeatherInfoProps {
  temp: string
  icon: string
  cityName: string
  isOnlyDeleteButton?: boolean
  onSave?: () => void
  onDelete: () => void
}
