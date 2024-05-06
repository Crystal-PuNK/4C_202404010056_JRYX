export function pageClear (page) {
  page.forEach(item => {
    item.flag2 = true
    item.flag1 = false
  })
}
