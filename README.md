FragmentPagerAdapterSample
==========================

FragmentPagerAdapterのサンプルプロジェクト

作成参考：http://dev.classmethod.jp/smartphone/android/android-tips-31-fragment-pager-adapter/

注意点
・ViewPagerは直接setContentViewにセットしない
・ViewPagerはjavaで生成せず、xmlで生成する。(android.content.res.Resources$NotFoundException: Unable to find resource ID #0xffffffff のエラーが出る)
