import dayjs from 'dayjs'

export default class DayjsAdapter {
  private dayOfWeekAsString(dayOfWeek: number): string {
    let result = 'sunday'
    switch (dayOfWeek) {
      case 0:
        break
      case 1:
        result = 'MON'
        break
      case 2:
        result = 'TUE'
        break
      case 3:
        result = 'WED'
        break
      case 4:
        result = 'THU'
        break
      case 5:
        result = 'FRI'
        break
      case 6:
        result = 'SAT'
        break
      default:
        break
    }
    return result
  }

  getTodayString(): string {
    const today = dayjs()
    const todayDateString = today.format('YYYY-MM-DD')
    const todayDayOfWeek = this.dayOfWeekAsString(today.day())
    const todayTimeString = today.format('HH:mm:ss')
    const todayString = `${todayDateString} (${todayDayOfWeek}) ${todayTimeString}`
    return todayString
  }
}
