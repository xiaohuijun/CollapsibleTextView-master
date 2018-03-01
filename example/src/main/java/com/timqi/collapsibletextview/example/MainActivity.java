package com.timqi.collapsibletextview.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.timqi.collapsibletextview.CollapsibleTextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CollapsibleTextView mText;

    private String
            mShortText = "I lost my shoe.",
            mLongText = "相册中包含视频、图片、GIF图片，其中视频会显示时长和播放标识、GIF图片会有GIF标识。\n" +
                    "相册列表中增加【视频】\n" +
                    "\n" +
                    "1、未选中图片时，无法点击下一步按钮\n" +
                    "2、未选中图片时，点击取消可直接返回；选中图片时，点击取消会弹窗询问【确定不添加图片或视频吗？】，确定即返回，取消则停留在原页面\n" +
                    "3、选中图片后，按钮位置将显示已选中的数量，按钮可点击\n" +
                    "4、选中图片后，去选择视频将弹toast提示【图片和视频不能同时选择】\n" +
                    "5、选中图片后，可点击原图选择上传原图；若未选择，则默认是上传压缩后的图片，图片最大宽度限制在750像素\n" +
                    "6、点击图片，可以对相册进行预览，横向滑动将在相册中预览\n" +
                    "7、选中图片后，点击预览按钮，对选中的图片进行预览，横向滑动将在选中图片间预览\n" +
                    "8、点击下一步按钮，完成图片添加，添加的图片会显示在编辑发布页面";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = (CollapsibleTextView) findViewById(R.id.normal);
        mText.setOnClickListener(this);
        mText.setFullString(mLongText);
        findViewById(R.id.showShort).setOnClickListener(this);
        findViewById(R.id.showLong).setOnClickListener(this);
        findViewById(R.id.collapsed).setOnClickListener(this);
        findViewById(R.id.expanded).setOnClickListener(this);
        findViewById(R.id.redSuffix).setOnClickListener(this);
        findViewById(R.id.blueSuffix).setOnClickListener(this);
        findViewById(R.id.showLong).setOnClickListener(this);
        findViewById(R.id.collapsed1line).setOnClickListener(this);
        findViewById(R.id.collapsed2lines).setOnClickListener(this);
        findViewById(R.id.collapsedTextShowAll).setOnClickListener(this);
        findViewById(R.id.collapsedTextShowText).setOnClickListener(this);
        findViewById(R.id.expandedTextHide).setOnClickListener(this);
        findViewById(R.id.expandedTextHideText).setOnClickListener(this);
        findViewById(R.id.suffixTrigger).setOnClickListener(this);
        findViewById(R.id.fullTextTrigger).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.normal:
                Toast.makeText(v.getContext(), "click", Toast.LENGTH_SHORT).show();
                break;
            case R.id.showShort:
                mText.setFullString(mShortText);
                break;
            case R.id.showLong:
                mText.setFullString(mLongText);
                break;
            case R.id.expanded:
                mText.setExpanded(true);
                break;
            case R.id.collapsed:
                mText.setExpanded(false);
                break;
            case R.id.redSuffix:
                mText.setSuffixColor(0xffff0000);
                break;
            case R.id.blueSuffix:
                mText.setSuffixColor(0xff0000ff);
                break;
            case R.id.collapsed1line:
                mText.setCollapsedLines(1);
                break;
            case R.id.collapsed2lines:
                mText.setCollapsedLines(2);
                break;
            case R.id.suffixTrigger:
                mText.setSuffixTrigger(true);
                break;
            case R.id.fullTextTrigger:
                mText.setSuffixTrigger(false);
                break;
            case R.id.collapsedTextShowAll:
                mText.setCollapsedText(" Show All");
                break;
            case R.id.collapsedTextShowText:
                mText.setCollapsedText(" Show Text");
                break;
            case R.id.expandedTextHideText:
                mText.setExpandedText(" Hide Text");
                break;
            case R.id.expandedTextHide:
                mText.setExpandedText(" Hide");
                break;
        }
    }
}
