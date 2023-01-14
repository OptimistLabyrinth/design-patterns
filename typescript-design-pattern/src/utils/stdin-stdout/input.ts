import * as readline from 'readline'

export default class Input {
  private static readonly rl: readline.Interface = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
  })

  private static opened = true

  static async question(message?: string): Promise<string> {
    return await new Promise(
      (resolve) => Input.rl.question(message ?? '', (answer) => {
        resolve(answer)
      }),
    )
  }

  static close() {
    if (this.opened) {
      Input.rl.close()
      this.opened = false
    }
  }
}
