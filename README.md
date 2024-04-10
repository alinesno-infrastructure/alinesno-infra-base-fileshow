# 文件预览服务

文件预览服务主要用于查看和显示各种类型的文件。虽然有一些开源的组件可用，但在特定情况下可能需要更强的定制化，比如集成Yolo视频查看或云存储等功能，因此考虑独立开发定制化的服务。

## 预览需求
- word(docx/doc)
- ppt/pptx
- excel(xls/xles)
- markdown
- code(代码)
- zip/rar/tar/7z/gzip
- txt
- csv
- pdf
- xmind
- tif/tiff
- jpg/jpeg/png/git
- video
- mp3

## 集成方式

【http/https 资源文件预览】如果你的项目需要接入文件预览项目，达到对docx、excel、ppt、jpg等文件的预览效果，那么通过在你的项目中加入下面的代码就可以成功实现：
```js
var url = 'http://127.0.0.1:8080/file/test.txt'; //要预览文件的访问地址
window.open('http://127.0.0.1:30119/onlinePreview?url='+encodeURIComponent(base64Encode(url)));
```


【http/https 流资源文件预览】很多系统内不是直接暴露文件下载地址，而是请求通过id、code等参数到通过统一的接口，后端通过id或code等参数定位文件，再通过OutputStream输出下载，此时下载url是不带文件后缀名的，预览时需要拿到文件名，传一个参数fullfilename=xxx.xxx来指定文件名，示例如下
```js
var originUrl = 'http://127.0.0.1:8080/filedownload?fileId=1'; //要预览文件的访问地址
var previewUrl = originUrl + '&fullfilename=test.txt'
window.open('http://127.0.0.1:30119/onlinePreview?url='+encodeURIComponent(Base64.encode(previewUrl)));
```


【ftp 资源文件预览】如果要预览的FTP url是可以匿名访问的（不需要用户名密码），则可以直接通过下载url预览，示例如下
```js
var url = 'ftp://127.0.0.1/file/test.txt'; //要预览文件的访问地址
window.open('http://127.0.0.1:30119/onlinePreview?url='+encodeURIComponent(Base64.encode(url)));
```


【ftp 加密资源文件预览】如果 FTP 需要认证访问服，可以通过在 url 中加入用户名密码等参数预览，示例如下
```js
var originUrl = 'ftp://127.0.0.1/file/test.txt'; //要预览文件的访问地址
var previewUrl = originUrl + '?ftp.username=xx&ftp.password=xx&ftp.control.encoding=xx';
window.open('http://127.0.0.1:30119/onlinePreview?url='+encodeURIComponent(Base64.encode(previewUrl)));
```

## 集成完成进度
| 序号 | 类型               | 描述         | 进度 | 备注 |
|------|--------------------|--------------|------|------|
| 1    | word(docx/doc)     | 文档         |      |      |
| 2    | ppt/pptx           | 演示文稿     |      |      |
| 3    | excel(xls/xles)    | 表格         |      |      |
| 4    | markdown           | Markdown文档 |      |      |
| 5    | code(代码)         | 代码文件     |      |      |
| 6    | zip/rar/tar/7z/gzip| 压缩文件     |      |      |
| 7    | txt                | 文本文件     |      |      |
| 8    | csv                | CSV文件      |      |      |
| 9    | pdf                | PDF文件      |      |      |
| 10   | xmind              | 思维导图     |      |      |
| 11   | tif/tiff           | 图像文件     |      |      |
| 12   | jpg/jpeg/png/git   | 图像文件     |      |      |
| 13   | video              | 视频文件     |      |      |
| 14   | mp3                | 音频文件     |      |      |

## 鸣谢

- 预览部分通过[kkFileView](https://gitee.com/kekingcn/file-online-preview)进行的二次开发，集成思路亦参考之
