package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.SupportedAbi

object Constants {
    val COMPATIBILITY_PUTMASK = Compatibility(
        name = "PutMask",
        packageName = "com.putmask.facefilter",
        apkFileType = ApkFileType.APK,
        appIconColor = 0x42A5F5,   // 6-digit RGB only — no alpha channel
        targets = listOf(
            AppTarget(version = "9.1.0")
        )
    )
}
