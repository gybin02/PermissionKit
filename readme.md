### PermissionKit 
 方便实现 6.0 以上权限授权,
 * 1. 使用单例模式;申请权限：调用requestPermissionsIfNecessaryForResult
 * 2. 先要在onRequestPermissionsResult 里面 发下通知notifyPermissionsChange
 * 3. 需要在Manifest里面先申请权限：包括普通权限和需要申请的特殊权限。
 * 4. 所有的权限 Manifest.permission.WRITE_EXTERNAL_STORAGE
 
### Gradle usage
* 
* Available from jcenter

## How to Use

```java
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
### 交流群：ç
 QQ群：547612870 
 
### License

Copyright 2017 zhengxiaobin@xiaoyouzi.com; 

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

