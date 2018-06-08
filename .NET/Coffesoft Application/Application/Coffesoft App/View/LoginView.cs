using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using ControlsDesigner;

namespace App.View
{
    public partial class LoginView : Form
    {
        private const int WM_NCHITTEST = 0x84;
        private const int HT_CLIENT = 0x1;
        private const int HT_CAPTION = 0x2;

        public LoginView()
        {
            InitializeComponent();

        }

        private void MinimizeButton_Click(object sender, EventArgs e)
        {
            WindowState = FormWindowState.Minimized;
        }

        private void CloseButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void MaximizeButton_Click(object sender, EventArgs e)
        {
            this.MaximizedBounds = Screen.FromHandle(this.Handle).WorkingArea;
            WindowState = WindowState == FormWindowState.Maximized ? FormWindowState.Normal : FormWindowState.Maximized;
        }

        protected override void WndProc(ref Message m)
        {
            switch (m.Msg)
            {
                case 0x84:
                    base.WndProc(ref m);
                    if ((int)m.Result == 0x1)
                        m.Result = (IntPtr)0x2;
                    return;
            }

            base.WndProc(ref m);
        }

        private void LoginView_Load(object sender, EventArgs e)
        {
            TitleBar.AddEvent(MinimizeButton_Click, ButtonBar.Minimize);
            TitleBar.AddEvent(MaximizeButton_Click, ButtonBar.Maximize);
            TitleBar.AddEvent(CloseButton_Click, ButtonBar.Close);
        }
    }
}
