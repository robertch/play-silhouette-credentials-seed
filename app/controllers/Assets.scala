package controllers

import utils.ErrorHandler
import controllers.Assets.Asset
import javax.inject.Inject

class MyAssets @Inject() (val errorHandler: ErrorHandler) extends AssetsBuilder(errorHandler) {
  def public(path: String, file: Asset) = versioned(path, file)
  def lib(path: String, file: Asset) = versioned(path, file)
  def css(path: String, file: Asset) = versioned(path, file)
  def commonCss(path: String, file: Asset) = versioned(path, file)
  def js(path: String, file: Asset) = versioned(path, file)
  def commonJs(path: String, file: Asset) = versioned(path, file)
  def img(path: String, file: Asset) = versioned(path, file)
  def commonImg(path: String, file: Asset) = versioned(path, file)
}