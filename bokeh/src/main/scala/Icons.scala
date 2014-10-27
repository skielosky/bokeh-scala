package io.continuum.bokeh

sealed trait NamedIcon extends EnumType {
    override val name = Utils.snakify(toString, '-')
}
@enum object NamedIcon extends Enumerated[NamedIcon] {
    case object Adjust extends NamedIcon
    case object Adn extends NamedIcon
    case object AlignCenter extends NamedIcon
    case object AlignJustify extends NamedIcon
    case object AlignLeft extends NamedIcon
    case object AlignRight extends NamedIcon
    case object Ambulance extends NamedIcon
    case object Anchor extends NamedIcon
    case object Android extends NamedIcon
    case object Angellist extends NamedIcon
    case object AngleDoubleDown extends NamedIcon
    case object AngleDoubleLeft extends NamedIcon
    case object AngleDoubleRight extends NamedIcon
    case object AngleDoubleUp extends NamedIcon
    case object AngleDown extends NamedIcon
    case object AngleLeft extends NamedIcon
    case object AngleRight extends NamedIcon
    case object AngleUp extends NamedIcon
    case object Apple extends NamedIcon
    case object Archive extends NamedIcon
    case object AreaChart extends NamedIcon
    case object ArrowCircleDown extends NamedIcon
    case object ArrowCircleLeft extends NamedIcon
    case object ArrowCircleODown extends NamedIcon
    case object ArrowCircleOLeft extends NamedIcon
    case object ArrowCircleORight extends NamedIcon
    case object ArrowCircleOUp extends NamedIcon
    case object ArrowCircleRight extends NamedIcon
    case object ArrowCircleUp extends NamedIcon
    case object ArrowDown extends NamedIcon
    case object ArrowLeft extends NamedIcon
    case object ArrowRight extends NamedIcon
    case object ArrowUp extends NamedIcon
    case object Arrows extends NamedIcon
    case object ArrowsAlt extends NamedIcon
    case object ArrowsH extends NamedIcon
    case object ArrowsV extends NamedIcon
    case object Asterisk extends NamedIcon
    case object At extends NamedIcon
    case object Automobile extends NamedIcon
    case object Backward extends NamedIcon
    case object Ban extends NamedIcon
    case object Bank extends NamedIcon
    case object BarChart extends NamedIcon
    case object BarChartO extends NamedIcon
    case object Barcode extends NamedIcon
    case object Bars extends NamedIcon
    case object Beer extends NamedIcon
    case object Behance extends NamedIcon
    case object BehanceSquare extends NamedIcon
    case object Bell extends NamedIcon
    case object BellO extends NamedIcon
    case object BellSlash extends NamedIcon
    case object BellSlashO extends NamedIcon
    case object Bicycle extends NamedIcon
    case object Binoculars extends NamedIcon
    case object BirthdayCake extends NamedIcon
    case object Bitbucket extends NamedIcon
    case object BitbucketSquare extends NamedIcon
    case object Bitcoin extends NamedIcon
    case object Bold extends NamedIcon
    case object Bolt extends NamedIcon
    case object Bomb extends NamedIcon
    case object Book extends NamedIcon
    case object Bookmark extends NamedIcon
    case object BookmarkO extends NamedIcon
    case object Briefcase extends NamedIcon
    case object Btc extends NamedIcon
    case object Bug extends NamedIcon
    case object Building extends NamedIcon
    case object BuildingO extends NamedIcon
    case object Bullhorn extends NamedIcon
    case object Bullseye extends NamedIcon
    case object Bus extends NamedIcon
    case object Cab extends NamedIcon
    case object Calculator extends NamedIcon
    case object Calendar extends NamedIcon
    case object CalendarO extends NamedIcon
    case object Camera extends NamedIcon
    case object CameraRetro extends NamedIcon
    case object Car extends NamedIcon
    case object CaretDown extends NamedIcon
    case object CaretLeft extends NamedIcon
    case object CaretRight extends NamedIcon
    case object CaretSquareODown extends NamedIcon
    case object CaretSquareOLeft extends NamedIcon
    case object CaretSquareORight extends NamedIcon
    case object CaretSquareOUp extends NamedIcon
    case object CaretUp extends NamedIcon
    case object Cc extends NamedIcon
    case object CcAmex extends NamedIcon
    case object CcDiscover extends NamedIcon
    case object CcMastercard extends NamedIcon
    case object CcPaypal extends NamedIcon
    case object CcStripe extends NamedIcon
    case object CcVisa extends NamedIcon
    case object Certificate extends NamedIcon
    case object Chain extends NamedIcon
    case object ChainBroken extends NamedIcon
    case object Check extends NamedIcon
    case object CheckCircle extends NamedIcon
    case object CheckCircleO extends NamedIcon
    case object CheckSquare extends NamedIcon
    case object CheckSquareO extends NamedIcon
    case object ChevronCircleDown extends NamedIcon
    case object ChevronCircleLeft extends NamedIcon
    case object ChevronCircleRight extends NamedIcon
    case object ChevronCircleUp extends NamedIcon
    case object ChevronDown extends NamedIcon
    case object ChevronLeft extends NamedIcon
    case object ChevronRight extends NamedIcon
    case object ChevronUp extends NamedIcon
    case object Child extends NamedIcon
    case object Circle extends NamedIcon
    case object CircleO extends NamedIcon
    case object CircleONotch extends NamedIcon
    case object CircleThin extends NamedIcon
    case object Clipboard extends NamedIcon
    case object ClockO extends NamedIcon
    case object Close extends NamedIcon
    case object Cloud extends NamedIcon
    case object CloudDownload extends NamedIcon
    case object CloudUpload extends NamedIcon
    case object Cny extends NamedIcon
    case object Code extends NamedIcon
    case object CodeFork extends NamedIcon
    case object Codepen extends NamedIcon
    case object Coffee extends NamedIcon
    case object Cog extends NamedIcon
    case object Cogs extends NamedIcon
    case object Columns extends NamedIcon
    case object Comment extends NamedIcon
    case object CommentO extends NamedIcon
    case object Comments extends NamedIcon
    case object CommentsO extends NamedIcon
    case object Compass extends NamedIcon
    case object Compress extends NamedIcon
    case object Copy extends NamedIcon
    case object Copyright extends NamedIcon
    case object CreditCard extends NamedIcon
    case object Crop extends NamedIcon
    case object Crosshairs extends NamedIcon
    case object Css3 extends NamedIcon
    case object Cube extends NamedIcon
    case object Cubes extends NamedIcon
    case object Cut extends NamedIcon
    case object Cutlery extends NamedIcon
    case object Dashboard extends NamedIcon
    case object Database extends NamedIcon
    case object Dedent extends NamedIcon
    case object Delicious extends NamedIcon
    case object Desktop extends NamedIcon
    case object Deviantart extends NamedIcon
    case object Digg extends NamedIcon
    case object Dollar extends NamedIcon
    case object DotCircleO extends NamedIcon
    case object Download extends NamedIcon
    case object Dribbble extends NamedIcon
    case object Dropbox extends NamedIcon
    case object Drupal extends NamedIcon
    case object Edit extends NamedIcon
    case object Eject extends NamedIcon
    case object EllipsisH extends NamedIcon
    case object EllipsisV extends NamedIcon
    case object Empire extends NamedIcon
    case object Envelope extends NamedIcon
    case object EnvelopeO extends NamedIcon
    case object EnvelopeSquare extends NamedIcon
    case object Eraser extends NamedIcon
    case object Eur extends NamedIcon
    case object Euro extends NamedIcon
    case object Exchange extends NamedIcon
    case object Exclamation extends NamedIcon
    case object ExclamationCircle extends NamedIcon
    case object ExclamationTriangle extends NamedIcon
    case object Expand extends NamedIcon
    case object ExternalLink extends NamedIcon
    case object ExternalLinkSquare extends NamedIcon
    case object Eye extends NamedIcon
    case object EyeSlash extends NamedIcon
    case object Eyedropper extends NamedIcon
    case object Facebook extends NamedIcon
    case object FacebookSquare extends NamedIcon
    case object FastBackward extends NamedIcon
    case object FastForward extends NamedIcon
    case object Fax extends NamedIcon
    case object Female extends NamedIcon
    case object FighterJet extends NamedIcon
    case object File extends NamedIcon
    case object FileArchiveO extends NamedIcon
    case object FileAudioO extends NamedIcon
    case object FileCodeO extends NamedIcon
    case object FileExcelO extends NamedIcon
    case object FileImageO extends NamedIcon
    case object FileMovieO extends NamedIcon
    case object FileO extends NamedIcon
    case object FilePdfO extends NamedIcon
    case object FilePhotoO extends NamedIcon
    case object FilePictureO extends NamedIcon
    case object FilePowerpointO extends NamedIcon
    case object FileSoundO extends NamedIcon
    case object FileText extends NamedIcon
    case object FileTextO extends NamedIcon
    case object FileVideoO extends NamedIcon
    case object FileWordO extends NamedIcon
    case object FileZipO extends NamedIcon
    case object FilesO extends NamedIcon
    case object Film extends NamedIcon
    case object Filter extends NamedIcon
    case object Fire extends NamedIcon
    case object FireExtinguisher extends NamedIcon
    case object Flag extends NamedIcon
    case object FlagCheckered extends NamedIcon
    case object FlagO extends NamedIcon
    case object Flash extends NamedIcon
    case object Flask extends NamedIcon
    case object Flickr extends NamedIcon
    case object FloppyO extends NamedIcon
    case object Folder extends NamedIcon
    case object FolderO extends NamedIcon
    case object FolderOpen extends NamedIcon
    case object FolderOpenO extends NamedIcon
    case object Font extends NamedIcon
    case object Forward extends NamedIcon
    case object Foursquare extends NamedIcon
    case object FrownO extends NamedIcon
    case object FutbolO extends NamedIcon
    case object Gamepad extends NamedIcon
    case object Gavel extends NamedIcon
    case object Gbp extends NamedIcon
    case object Ge extends NamedIcon
    case object Gear extends NamedIcon
    case object Gears extends NamedIcon
    case object Gift extends NamedIcon
    case object Git extends NamedIcon
    case object GitSquare extends NamedIcon
    case object Github extends NamedIcon
    case object GithubAlt extends NamedIcon
    case object GithubSquare extends NamedIcon
    case object Gittip extends NamedIcon
    case object Glass extends NamedIcon
    case object Globe extends NamedIcon
    case object Google extends NamedIcon
    case object GooglePlus extends NamedIcon
    case object GooglePlusSquare extends NamedIcon
    case object GoogleWallet extends NamedIcon
    case object GraduationCap extends NamedIcon
    case object Group extends NamedIcon
    case object HSquare extends NamedIcon
    case object HackerNews extends NamedIcon
    case object HandODown extends NamedIcon
    case object HandOLeft extends NamedIcon
    case object HandORight extends NamedIcon
    case object HandOUp extends NamedIcon
    case object HddO extends NamedIcon
    case object Header extends NamedIcon
    case object Headphones extends NamedIcon
    case object Heart extends NamedIcon
    case object HeartO extends NamedIcon
    case object History extends NamedIcon
    case object Home extends NamedIcon
    case object HospitalO extends NamedIcon
    case object Html5 extends NamedIcon
    case object Ils extends NamedIcon
    case object Image extends NamedIcon
    case object Inbox extends NamedIcon
    case object Indent extends NamedIcon
    case object Info extends NamedIcon
    case object InfoCircle extends NamedIcon
    case object Inr extends NamedIcon
    case object Instagram extends NamedIcon
    case object Institution extends NamedIcon
    case object Ioxhost extends NamedIcon
    case object Italic extends NamedIcon
    case object Joomla extends NamedIcon
    case object Jpy extends NamedIcon
    case object Jsfiddle extends NamedIcon
    case object Key extends NamedIcon
    case object KeyboardO extends NamedIcon
    case object Krw extends NamedIcon
    case object Language extends NamedIcon
    case object Laptop extends NamedIcon
    case object Lastfm extends NamedIcon
    case object LastfmSquare extends NamedIcon
    case object Leaf extends NamedIcon
    case object Legal extends NamedIcon
    case object LemonO extends NamedIcon
    case object LevelDown extends NamedIcon
    case object LevelUp extends NamedIcon
    case object LifeBouy extends NamedIcon
    case object LifeBuoy extends NamedIcon
    case object LifeRing extends NamedIcon
    case object LifeSaver extends NamedIcon
    case object LightbulbO extends NamedIcon
    case object LineChart extends NamedIcon
    case object Link extends NamedIcon
    case object Linkedin extends NamedIcon
    case object LinkedinSquare extends NamedIcon
    case object Linux extends NamedIcon
    case object List extends NamedIcon
    case object ListAlt extends NamedIcon
    case object ListOl extends NamedIcon
    case object ListUl extends NamedIcon
    case object LocationArrow extends NamedIcon
    case object Lock extends NamedIcon
    case object LongArrowDown extends NamedIcon
    case object LongArrowLeft extends NamedIcon
    case object LongArrowRight extends NamedIcon
    case object LongArrowUp extends NamedIcon
    case object Magic extends NamedIcon
    case object Magnet extends NamedIcon
    case object MailForward extends NamedIcon
    case object MailReply extends NamedIcon
    case object MailReplyAll extends NamedIcon
    case object Male extends NamedIcon
    case object MapMarker extends NamedIcon
    case object Maxcdn extends NamedIcon
    case object Meanpath extends NamedIcon
    case object Medkit extends NamedIcon
    case object MehO extends NamedIcon
    case object Microphone extends NamedIcon
    case object MicrophoneSlash extends NamedIcon
    case object Minus extends NamedIcon
    case object MinusCircle extends NamedIcon
    case object MinusSquare extends NamedIcon
    case object MinusSquareO extends NamedIcon
    case object Mobile extends NamedIcon
    case object MobilePhone extends NamedIcon
    case object Money extends NamedIcon
    case object MoonO extends NamedIcon
    case object MortarBoard extends NamedIcon
    case object Music extends NamedIcon
    case object Navicon extends NamedIcon
    case object NewspaperO extends NamedIcon
    case object Openid extends NamedIcon
    case object Outdent extends NamedIcon
    case object Pagelines extends NamedIcon
    case object PaintBrush extends NamedIcon
    case object PaperPlane extends NamedIcon
    case object PaperPlaneO extends NamedIcon
    case object Paperclip extends NamedIcon
    case object Paragraph extends NamedIcon
    case object Paste extends NamedIcon
    case object Pause extends NamedIcon
    case object Paw extends NamedIcon
    case object Paypal extends NamedIcon
    case object Pencil extends NamedIcon
    case object PencilSquare extends NamedIcon
    case object PencilSquareO extends NamedIcon
    case object Phone extends NamedIcon
    case object PhoneSquare extends NamedIcon
    case object Photo extends NamedIcon
    case object PictureO extends NamedIcon
    case object PieChart extends NamedIcon
    case object PiedPiper extends NamedIcon
    case object PiedPiperAlt extends NamedIcon
    case object Pinterest extends NamedIcon
    case object PinterestSquare extends NamedIcon
    case object Plane extends NamedIcon
    case object Play extends NamedIcon
    case object PlayCircle extends NamedIcon
    case object PlayCircleO extends NamedIcon
    case object Plug extends NamedIcon
    case object Plus extends NamedIcon
    case object PlusCircle extends NamedIcon
    case object PlusSquare extends NamedIcon
    case object PlusSquareO extends NamedIcon
    case object PowerOff extends NamedIcon
    case object Print extends NamedIcon
    case object PuzzlePiece extends NamedIcon
    case object Qq extends NamedIcon
    case object Qrcode extends NamedIcon
    case object Question extends NamedIcon
    case object QuestionCircle extends NamedIcon
    case object QuoteLeft extends NamedIcon
    case object QuoteRight extends NamedIcon
    case object Ra extends NamedIcon
    case object Random extends NamedIcon
    case object Rebel extends NamedIcon
    case object Recycle extends NamedIcon
    case object Reddit extends NamedIcon
    case object RedditSquare extends NamedIcon
    case object Refresh extends NamedIcon
    case object Remove extends NamedIcon
    case object Renren extends NamedIcon
    case object Reorder extends NamedIcon
    case object Repeat extends NamedIcon
    case object Reply extends NamedIcon
    case object ReplyAll extends NamedIcon
    case object Retweet extends NamedIcon
    case object Rmb extends NamedIcon
    case object Road extends NamedIcon
    case object Rocket extends NamedIcon
    case object RotateLeft extends NamedIcon
    case object RotateRight extends NamedIcon
    case object Rouble extends NamedIcon
    case object Rss extends NamedIcon
    case object RssSquare extends NamedIcon
    case object Rub extends NamedIcon
    case object Ruble extends NamedIcon
    case object Rupee extends NamedIcon
    case object Save extends NamedIcon
    case object Scissors extends NamedIcon
    case object Search extends NamedIcon
    case object SearchMinus extends NamedIcon
    case object SearchPlus extends NamedIcon
    case object Send extends NamedIcon
    case object SendO extends NamedIcon
    case object Share extends NamedIcon
    case object ShareAlt extends NamedIcon
    case object ShareAltSquare extends NamedIcon
    case object ShareSquare extends NamedIcon
    case object ShareSquareO extends NamedIcon
    case object Shekel extends NamedIcon
    case object Sheqel extends NamedIcon
    case object Shield extends NamedIcon
    case object ShoppingCart extends NamedIcon
    case object SignIn extends NamedIcon
    case object SignOut extends NamedIcon
    case object Signal extends NamedIcon
    case object Sitemap extends NamedIcon
    case object Skype extends NamedIcon
    case object Slack extends NamedIcon
    case object Sliders extends NamedIcon
    case object Slideshare extends NamedIcon
    case object SmileO extends NamedIcon
    case object SoccerBallO extends NamedIcon
    case object Sort extends NamedIcon
    case object SortAlphaAsc extends NamedIcon
    case object SortAlphaDesc extends NamedIcon
    case object SortAmountAsc extends NamedIcon
    case object SortAmountDesc extends NamedIcon
    case object SortAsc extends NamedIcon
    case object SortDesc extends NamedIcon
    case object SortDown extends NamedIcon
    case object SortNumericAsc extends NamedIcon
    case object SortNumericDesc extends NamedIcon
    case object SortUp extends NamedIcon
    case object Soundcloud extends NamedIcon
    case object SpaceShuttle extends NamedIcon
    case object Spinner extends NamedIcon
    case object Spoon extends NamedIcon
    case object Spotify extends NamedIcon
    case object Square extends NamedIcon
    case object SquareO extends NamedIcon
    case object StackExchange extends NamedIcon
    case object StackOverflow extends NamedIcon
    case object Star extends NamedIcon
    case object StarHalf extends NamedIcon
    case object StarHalfEmpty extends NamedIcon
    case object StarHalfFull extends NamedIcon
    case object StarHalfO extends NamedIcon
    case object StarO extends NamedIcon
    case object Steam extends NamedIcon
    case object SteamSquare extends NamedIcon
    case object StepBackward extends NamedIcon
    case object StepForward extends NamedIcon
    case object Stethoscope extends NamedIcon
    case object Stop extends NamedIcon
    case object Strikethrough extends NamedIcon
    case object Stumbleupon extends NamedIcon
    case object StumbleuponCircle extends NamedIcon
    case object Subscript extends NamedIcon
    case object Suitcase extends NamedIcon
    case object SunO extends NamedIcon
    case object Superscript extends NamedIcon
    case object Support extends NamedIcon
    case object Table extends NamedIcon
    case object Tablet extends NamedIcon
    case object Tachometer extends NamedIcon
    case object Tag extends NamedIcon
    case object Tags extends NamedIcon
    case object Tasks extends NamedIcon
    case object Taxi extends NamedIcon
    case object TencentWeibo extends NamedIcon
    case object Terminal extends NamedIcon
    case object TextHeight extends NamedIcon
    case object TextWidth extends NamedIcon
    case object Th extends NamedIcon
    case object ThLarge extends NamedIcon
    case object ThList extends NamedIcon
    case object ThumbTack extends NamedIcon
    case object ThumbsDown extends NamedIcon
    case object ThumbsODown extends NamedIcon
    case object ThumbsOUp extends NamedIcon
    case object ThumbsUp extends NamedIcon
    case object Ticket extends NamedIcon
    case object Times extends NamedIcon
    case object TimesCircle extends NamedIcon
    case object TimesCircleO extends NamedIcon
    case object Tint extends NamedIcon
    case object ToggleDown extends NamedIcon
    case object ToggleLeft extends NamedIcon
    case object ToggleOff extends NamedIcon
    case object ToggleOn extends NamedIcon
    case object ToggleRight extends NamedIcon
    case object ToggleUp extends NamedIcon
    case object Trash extends NamedIcon
    case object TrashO extends NamedIcon
    case object Tree extends NamedIcon
    case object Trello extends NamedIcon
    case object Trophy extends NamedIcon
    case object Truck extends NamedIcon
    case object Try extends NamedIcon
    case object Tty extends NamedIcon
    case object Tumblr extends NamedIcon
    case object TumblrSquare extends NamedIcon
    case object TurkishLira extends NamedIcon
    case object Twitch extends NamedIcon
    case object Twitter extends NamedIcon
    case object TwitterSquare extends NamedIcon
    case object Umbrella extends NamedIcon
    case object Underline extends NamedIcon
    case object Undo extends NamedIcon
    case object University extends NamedIcon
    case object Unlink extends NamedIcon
    case object Unlock extends NamedIcon
    case object UnlockAlt extends NamedIcon
    case object Unsorted extends NamedIcon
    case object Upload extends NamedIcon
    case object Usd extends NamedIcon
    case object User extends NamedIcon
    case object UserMd extends NamedIcon
    case object Users extends NamedIcon
    case object VideoCamera extends NamedIcon
    case object VimeoSquare extends NamedIcon
    case object Vine extends NamedIcon
    case object Vk extends NamedIcon
    case object VolumeDown extends NamedIcon
    case object VolumeOff extends NamedIcon
    case object VolumeUp extends NamedIcon
    case object Warning extends NamedIcon
    case object Wechat extends NamedIcon
    case object Weibo extends NamedIcon
    case object Weixin extends NamedIcon
    case object Wheelchair extends NamedIcon
    case object Wifi extends NamedIcon
    case object Windows extends NamedIcon
    case object Won extends NamedIcon
    case object Wordpress extends NamedIcon
    case object Wrench extends NamedIcon
    case object Xing extends NamedIcon
    case object XingSquare extends NamedIcon
    case object Yahoo extends NamedIcon
    case object Yelp extends NamedIcon
    case object Yen extends NamedIcon
    case object Youtube extends NamedIcon
    case object YoutubePlay extends NamedIcon
    case object YoutubeSquare extends NamedIcon
}
