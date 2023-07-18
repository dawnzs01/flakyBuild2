## 创建飞书数据源（目标）

您需要前往 https://open.feishu.cn/app 找到对应的应用，并在应用的 ***凭证与基础信息*** 中找到：

![](https://tapdata-bucket-01.oss-cn-beijing.aliyuncs.com/FeiShu/doc/findApp.PNG)

![](https://tapdata-bucket-01.oss-cn-beijing.aliyuncs.com/FeiShu/doc/appIdAndSecret.PNG)

1. 获取到***App ID***,并填写到此处。
   
2. 获取到***App Secret***,并填写到此处。

此时，飞书数据源创建成功！
   
### 注意事项

#### 飞书发消息

如您需要使用飞书发消息：

***消息体结构应该如下***：

```json
[
  {
    "receiveType": "{{user | email | phone | chat}}",
    "receiveId": "{{user_open_id | user_email | user_phone | chat_id}}",
    "contentType": "text",
    "content": "{\"text\":\"Hello! This is lark message! \"}"
  }
]
```
其中：

- receiveType用来表示消息接收者类型，取值范围为[ user | chat | email | phone ], 分别表示用户、群组，默认用户。

- contentType ***text*** | ***post*** | ***image*** | ***interactive*** | ***share_chat*** | ***share_user*** | ***audio*** | ***media*** | ***file*** | ***sticker***，默认***text***。
  具体的消息类型可查看官方文档上的描述：[https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/im-v1/message/create_json](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/im-v1/message/create_json)

- receiveId 为消息接收者的***open_id***或***手机号***或***邮箱***或***群聊的chat_id***，APP通过这个字段来发送消息到指定的用户或群聊。

 1. 您需要使用用户的注册手机号或邮箱发送指定消息到此人；
    
 2. 您需要保证当前手机号或邮箱的使用者存在于此应用的可见范围，如不在当前应用版本的可见范围，将无法发送消息到这个用户，如有必要，您可在应用版本管理与发布中查看最新版本下的可见范围，并创建新的版本并将此用户添加到可见范围。

![](https://tapdata-bucket-01.oss-cn-beijing.aliyuncs.com/FeiShu/doc/version.PNG)

![](https://tapdata-bucket-01.oss-cn-beijing.aliyuncs.com/FeiShu/doc/rang.PNG)

![](https://tapdata-bucket-01.oss-cn-beijing.aliyuncs.com/FeiShu/doc/createdVersion.PNG)

![](https://tapdata-bucket-01.oss-cn-beijing.aliyuncs.com/FeiShu/doc/modifyRang.PNG)