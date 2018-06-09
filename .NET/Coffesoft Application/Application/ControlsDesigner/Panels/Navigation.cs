using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ControlsDesigner.Panels
{
    public partial class Navigation : Panel
    {
        private Button[] buttons { get; set; } = { new Button() };

        public Point[] Locations
        {
            get => buttons.Select(x => x.Location).ToArray();
            set
            {
                for (int i = 0; i < value.Length; i++)
                {
                    buttons[i].Location = value[i];
                }
            }
        }

        public int ButtonSize { get; set; }

        private int count = 4;

        public int Count { get => count; set { count = value > 1 ? value : 1; InitializeContent(); } }

        public Navigation()
        {
            InitializeComponent();
            InitializeContent();
        }

        private void InitializeContent()
        {
            buttons = Enumerable.Range(0, Count).Select(new Func<int, Button>(Do)).ToArray();
            Locations = Locations;
            Controls.AddRange(buttons);

        }

        private Button Do(int x)
        {
            Button button = new Button();
            button.Size = new Size(button.Size.Width, Size.Height);
            return button;
        }

        private void Navigation_SizeChanged(object sender, EventArgs e)
        {
            Size = new Size(Size.Width, buttons[0].Size.Height);
        }
    }
}
