import request from '@/utils/request'

// 查询videoUpload列表
export function list视频上传(query) {
  return request({
    url: '/video/视频上传/list',
    method: 'get',
    params: query
  })
}

// 查询videoUpload详细
export function get视频上传(id) {
  return request({
    url: '/video/视频上传/' + id,
    method: 'get'
  })
}

// 新增videoUpload
export function add视频上传(data) {
  return request({
    url: '/video/视频上传',
    method: 'post',
    data: data
  })
}

// 修改videoUpload
export function update视频上传(data) {
  return request({
    url: '/video/视频上传',
    method: 'put',
    data: data
  })
}

// 删除videoUpload
export function del视频上传(id) {
  return request({
    url: '/video/视频上传/' + id,
    method: 'delete'
  })
}
