### PermissionKit  权限申请库
用来快速方便实现 6.0= 的权限授权,

### 流程
- 检查是否拥有权限-> 有权限 -> 回调权限申请成功
- 没有权限是否需要弹窗请求-> 不需要 -> 是否是被设置为永不提醒  
- 需要弹窗请求，监听是否点击确认-> 未点击 -> 权限申请被拒绝
- 点击确认主动申请权限，回调结果onRequestPermissionsResult
- 回调结果判断权限是否申请成功 -> 失败回调|成功回调
 
### Gradle usage
* 
* TODO,打包发布

## How to Use
1. 注册监听
```java
  //在Activity的系统回调里面注册 PermissionsManager
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionsManager.getInstance().notifyPermissionsChange(permissions, grantResults);
    }
```

2. 申请监听
```java
//单例实现
PermissionsManager.getInstance().requestPermissionsIfNecessaryForResult(this,
    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, new PermissionsResultAction() {

    @Override
    public void onGranted() {
        writeToStorage();
    }

    @Override
    public void onDenied(String permission) {
        Toast.makeText(MainActivity.this, 
                      "Sorry, we need the Storage Permission to do that", 
                      Toast.LENGTH_SHORT).show();
    }
});
```
 
### License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

